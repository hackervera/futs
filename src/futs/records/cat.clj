(in-ns 'futs.records)
(defrecord Cat [^clojure.lang.Atom name ^clojure.lang.Atom breed ^clojure.lang.Atom points]
	Animal
	(roar [t] (swap! points inc) 
		(if (< @points 3)
			(str t " lets out a huge ROAR and scores some points")
			(str t " advances to the next stage!!!!!!!!")))
	Mammal
	(milk [t] (str t " gets milked")))