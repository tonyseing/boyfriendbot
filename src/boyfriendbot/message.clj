(ns boyfriendbot.message
  (:require [twilio.core :as twilio]))

(defn send-txt-msg [sid auth-token sender recipient message]
  "Function takes a recipient phone number and a message and then sends a text message to that number"
  (let [response (twilio/with-auth sid auth-token
            (twilio/send-sms {:from sender
                              :to recipient
                              :body message}))]
    (println response)) )
