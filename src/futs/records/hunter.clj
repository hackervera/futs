(in-ns 'futs.records)
(defrecord Hunter [^futs.protocols.Animal diet]
	Animal
	(eat [x] "woo")
	(eat [t x] (str t " eats his prey: " diet " " x)))