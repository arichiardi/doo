(defproject lein-doo-example "0.1.0-SNAPSHOT"
  :description "Project to test lein-doo. Do not take it as an example"
  :url "https://github.com/bensu/doo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0-beta2"]
                 [org.clojure/clojurescript "0.0-3269"]]

  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-doo "0.1.0-SNAPSHOT"]]

  :clean-targets ^{:protect false} ["resources/public/js/" "target"]

  :cljsbuild
  {:builds {:dev {:source-paths ["src" "dev"]
                  :main 'example.dev 
                  :compiler {:output-to "resources/public/js/dev.js"
                             :optimizations :none}}
            :test {:source-paths ["src" "test"]
                   :compiler {:output-to "resources/public/js/testable.js"
                              :main 'example.runner
                              :optimizations :whitespace}}}})