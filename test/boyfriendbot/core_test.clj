(ns boyfriendbot.core-test
  (:require [clojure.test :refer :all]
            [boyfriendbot.message :refer :all]))



(deftest send-message
  (testing "Should send a message"
    (is (= 0 1))))
