(ns boyfriendbot.message
  (:require [clj-http.client :as client]
            [cemerick.url :refer (url url-encode)]))


(defn send-txt-message [msg auth]
  (let [accountSid (:accountSid auth)
        auth-token (:auth-token auth)
        twilio-url (str "https://api.twilio.com/2010-04-01/Accounts/" accountSid  "/Messages.json")])
  (client/post posturl
             { :basic-auth [accountSid auth-token]
               :accept :json
               :form-params msg}))
