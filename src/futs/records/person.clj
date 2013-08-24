(in-ns 'futs.records)
(defrecord Person [^clojure.lang.Atom name ^clojure.lang.Atom age]
	Human
	(sleep [t] (swap! age dec))
	Animal
	(eat [t x] (swap! age inc))
	(roar [t] (str t " tries to roar, but its not as loud as a feral animal"))
	Mammal
	(milk [t] (str t " gets their titties pulled")))