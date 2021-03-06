(defproject mtc-scraper "0.1.0-SNAPSHOT"
  :description "Clojure scraping"
  :url "http://gautamk.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                    [org.clojure/clojure "1.4.0"]
                    [org.clojure/clojure-contrib "1.2.0"]
                    [enlive "1.0.0-SNAPSHOT"]
                    [korma "0.3.0-beta7"]
                    [mysql/mysql-connector-java "5.1.22"]
            
                ]
    :main mtc-scraper.core
)
