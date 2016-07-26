(ns user
  (:require [mount.core :as mount]
            luminus-sandbox.core))

(defn start []
  (mount/start-without #'luminus-sandbox.core/repl-server))

(defn stop []
  (mount/stop-except #'luminus-sandbox.core/repl-server))

(defn restart []
  (stop)
  (start))


