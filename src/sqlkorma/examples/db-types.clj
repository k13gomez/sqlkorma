(defdb pg (postgres ..))
(defdb ms (mssql ..))
(defdb orc (oracle ..))
(defdb mys (mysql ..))

;; Or you can simply pass in a jdbc database specification
(defdb mydb {:classname   "org.h2.Driver" 
             :subprotocol "h2"
             :subname "tcp://localhost:9092/Sample"
             :user     "korma"
             :password "kormapass"})