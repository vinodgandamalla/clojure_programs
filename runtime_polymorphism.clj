(defn hello ([] "hello world!") ( [a] (str "hello,you silly" a "."))
  ([a & more] (str "hello to this group:" (apply str (interpose "," (concat (list a) more))) "!" ))

  )


(hello "john")
"hello,you sillyjohn."
(hello)
"hello world!"
(hello "john" "peter")
"hello to this group:john,peter!"
