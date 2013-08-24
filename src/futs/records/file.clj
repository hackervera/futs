(in-ns 'futs.records)
(def storable-methods
	{:save (fn [t] (str "foobar"))})
(defrecord File [name])
(extend futs.records.File
	Storable
	storable-methods)

