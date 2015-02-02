(defproject org.clojars.bschwind/html-parser "0.1.0"
  :description "Simple HTML parser/selector library built on Jsoup"
  :url "https://github.com/bschwind/html-parser"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.jsoup/jsoup "1.8.1"]]
  :main ^:skip-aot html-parser.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
