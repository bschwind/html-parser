(ns html-parser.core
  (:gen-class)
  (:import (org.jsoup Jsoup)))

(defn document-from-string
  [html-string]
  (org.jsoup.Jsoup/parse html-string))

(defn select
  [document selector]
  (.select document selector))

(defn select-one
  [document selector]
  (first (take 1 (.select document selector))))

(defn inner-text
  [element]
  (.text element))

(defn -main
  "Runs a test which selects the first element of the CSS class '.kana_column'"
  [& args]
  (def doc (-> "resources/test.html" (slurp) (document-from-string)))
  (-> doc (select-one ,,, ".kana_column") (inner-text) (println)))
