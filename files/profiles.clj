;;ok on 2.6.1
{:user {:plugins [[cider/cider-nrepl "0.8.1"]
                  [lein-droid "0.4.3"]]
         :android {:sdk-path "/home/andrew/dk/android-sdk-linux"
              :force-dex-optimize true}

}

 :android-user {:dependencies [[cider/cider-nrepl "0.9.1"]]
               :android {:aot-exclude-ns ["cider.nrepl.middleware.util.java.parser"
                                          "cider.nrepl" "cider-nrepl.plugin"]}}
 :android-common {:android {:sdk-path "/home/andrew/dk/android-sdk-linux"}}}
