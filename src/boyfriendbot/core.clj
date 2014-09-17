(ns boyfriendbot.core
  (:require [boyfriendbot.message :as message]
            [cheshire.core :as json]))

;; load configuation
(def config (json/parse-string (slurp "config.json") true)) 

