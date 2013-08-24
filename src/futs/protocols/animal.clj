(in-ns 'futs.protocols)
(defprotocol Animal
	(eat [t x] [x] "somthing else")
	(roar [t] "used to scare things"))