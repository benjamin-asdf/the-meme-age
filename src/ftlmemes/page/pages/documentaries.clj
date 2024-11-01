(ns
    ftlmemes.page.pages.documentaries
  (:require
   [shadow.css :refer (css)]
   [hiccup.util :as html]
   [hiccup.page :as hp]))


(def primary "#00FF00")
(def secondary "#00FFFF")
(def tert "#FF00FF")
(def button-text-color "#FFFFFF")

(defn
  page
  []
  (hp/html5
      [:html
       [:head
        [:meta {:charset "UTF-8"}]
        [:meta
         {:name "viewport"
          :content "width=device-width, initial-scale=1"}]
        [:link
         {:rel "shortcut icon"
          :href "data:,"}]
        [:link
         {:rel "apple-touch-icon"
          :href "data:,"}]
        ;; [:link
        ;;  {:rel "stylesheet"
        ;;   :href "https://cdn.simplecss.org/simple.min.css"}]
        [:link
         {:rel "stylesheet"
          :href "/css/ui.css"}]
        [:style]
        [:title
         "FTLM - Historical Science Documentaries"]]
       [:body
        [:div
         {:class (css
                   :flex
                   :px-6
                   :shadow
                   {:color "yellow"})
          }
         "foo 3"]
        ;;     <script src=\"https://cdn.jsdelivr.net/npm/scittle@0.6.15/dist/scittle.nrepl.js\" type=\"application/javascript\"></script>
        ;; ")
        ;; [:script {:type "application/x-scittle" :src ""}]
        ]]))


[{:gen/file "documentaries.html"
  :gen/content (page)}]

(ftlmemes.page.gen/gen-html!
 {:gen/file "documentaries.html"
  :gen/content (page)})