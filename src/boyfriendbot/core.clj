(ns boyfriendbot.core
  (:gen-class)
  (:require [boyfriendbot.message :as message]
            [cheshire.core :as json]
            [cronj.core :as cron]))

;; load configuation
(def config (json/parse-string (slurp "config.json") true))




(defn send-gf-msg-handler
  ""
  [t opts]
  (let [msgs (:messages config)
        auth (:auth config)
        chosen-msg-indx (rand-int (count (:messages config)))
        msg  (nth msgs chosen-msg-indx) ]

    (message/send-text-message msg auth)
    (println (str "Message sent: " msg))
    (println "Press q and *ENTER* to quit")
    ))

(defn -main
  []

  (let [schedule (:schedule config)] 
    (def send-gf-msg-task  {:id "send-gf-msg-task"
                            :handler send-gf-msg-handler
                          :schedule schedule  ;; sends out message, second minute hour day-of-week day-of-month month year
                          :opts {:output "Sent."}}))

  
  (def cj (cron/cronj :entries [send-gf-msg-task]))
  
  (def keep-running? (atom true))

  
  (cron/start! cj)
  (println "Boyfriend-Bot has begun. Press q and *ENTER* to stop Boyfriend-Bot.")
  
  (while @keep-running?
    (if (= (read-line) "q")
      (do
        (cron/stop! cj)
        (reset! keep-running? false)
        (println  "Boyfriend-Bot has terminated.")
        (System/exit 0)))))

 

