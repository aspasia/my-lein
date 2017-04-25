{:user {
 :plugins [;[cider/cider-nrepl "0.12.0"]
	   [org.clojure/clojure "1.8.0"]
	   [cider/cider-nrepl "0.15.0-SNAPSHOT"]
           ;[refactor-nrepl "1.1.0"]
           [lein-kibit "0.1.2"]
           [lein-bikeshed "0.3.0"]
           [jonase/eastwood "0.2.3"]
           [com.jakemccrary/lein-test-refresh "0.19.0"]
	   [s3-wagon-private "1.2.0" :exclusions [commons-codec]]
           [lein-ancient "0.6.10" :exclusions [org.apache.httpcomponents/httpcore org.apache.httpcomponents/httpclient]]
           #_[im.chit/vinyasa "0.4.5"]
	   #_[venantius/yagni "0.1.4" :exclusions [org.clojure/tools.namespace]]]}}
