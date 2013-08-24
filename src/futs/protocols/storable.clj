(in-ns 'futs.protocols)
(defprotocol Storable
	(save [t] "saves the record to a datastore"))
