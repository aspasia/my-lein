;; Uncomment for Java 10
{:repl {#_:plugins #_[[cider/cider-nrepl "0.18.0"]]
        :dependencies [[nrepl "0.4.5" :exclusions [org.clojure/tools.logging]]]}
 :user {:plugins [[nrepl/lein-nrepl "0.2.0"]
                  [nrepl "0.4.5" :exclusions [org.clojure/tools.logging]]
                  [lein-ancient "0.6.15"]
                  [lein-codox "0.10.7"]
                  [funcool/codeina "0.4.0"
           :exclusions [org.clojure/clojure]]]}}
