# html-parser
[![Clojars Project](http://clojars.org/org.clojars.bschwind/html-parser/latest-version.svg)](http://clojars.org/org.clojars.bschwind/html-parser)

A small Clojure wrapper for the JSoup Java library. Intended to simply consume an HTML string and allow for CSS queries

Installation
------------
Add `[org.clojars.bschwind/html-parser "0.1.0"]` to your dependencies in `project.clj`.

Usage
-----
```
(def doc (document-from-string "<html>Your HTML here</html>"))
(println (select doc "html")))
``` 
