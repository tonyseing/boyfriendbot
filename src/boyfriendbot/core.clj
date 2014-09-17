(ns boyfriendbot.core
  (:require [boyfriendbot.message :as message]
            [cheshire.core :as json]
            [cronj.core :as cron]))

;; load configuation
(def config (json/parse-string (slurp "config.json") true)) 

(defn send-gf-msg-handler
  ""
  [t opts]
  (let [msg (:message config)
        auth (:auth config)]
    (message/send-text-message msg auth)
    (println (str "Message sent: " msg))))



(def send-gf-msg-task  {:id "send-gf-msg-task"
                        :handler send-gf-msg-handler
                        :schedule "/2 * * * * * *"
                        :opts {:output "Hello There"}})


(def cj (cron/cronj :entries [send-gf-msg-task]))


;;(cron/start! cj)
;;(cron/stop! cj)



 

