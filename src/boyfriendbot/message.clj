(ns boyfriendbot.message
  (:require [clj-http.client :as client]
            [cemerick.url :refer (url url-encode)]))


(def posturl (str "https://api.twilio.com/2010-04-01/Accounts/" accountSid  "/Messages.json"))
(def msg  { :Body "clojuretest"  :To "+18608306959" :From "+18603560847"})

(client/post posturl
             { :basic-auth [accountSid auth-token]
               :accept :json
               :form-params msg})


