#_{:user {
 :plugins [#_[org.clojure/clojure "1.8.0"]
           #_[cider/cider-nrepl "0.18.0"] 
           #_[refactor-nrepl "1.1.0"]
           #_[lein-kibit "0.1.2"]
           [nrepl "0.4.5" :exclusions [org.clojure/tools.logging]]
           #_[lein-bikeshed "0.3.0"]
           #_[jonase/eastwood "0.2.3"]
           #_[com.jakemccrary/lein-test-refresh "0.19.0"]
	   #_[s3-wagon-private "1.2.0" :exclusions [commons-codec]]
           #_[lein-ancient "0.6.10" :exclusions [org.apache.httpcomponents/httpcore org.apache.httpcomponents/httpclient]]
           #_[im.chit/vinyasa "0.4.5"]
	   #_[venantius/yagni "0.1.4" :exclusions [org.clojure/tools.namespace]]]}}
;; Uncomment for Java 10
{:repl {#_:plugins #_[[cider/cider-nrepl "0.18.0"]]
        :dependencies [[nrepl "0.4.5" :exclusions [org.clojure/tools.logging]]]}
 :user {:plugins [[nrepl/lein-nrepl "0.2.0"]
                  [lein-ancient "0.6.15"]
                  [lein-codox "0.10.5"]
                  [funcool/codeina "0.4.0"
           :exclusions [org.clojure/clojure]]]}}
