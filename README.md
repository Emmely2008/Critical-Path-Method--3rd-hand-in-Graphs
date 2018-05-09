# Critical-Path-Method--3rd-hand-in-Graphs



[![https://gyazo.com/8491c03e29934dd7a4c26c4cce342c90](https://i.gyazo.com/8491c03e29934dd7a4c26c4cce342c90.png)](https://gyazo.com/8491c03e29934dd7a4c26c4cce342c90)




##### Results from the program


```
"C:\Program Files\Java\jdk-9.0.4\bin\java"
"-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.3.4\lib\idea_rt.jar=50594:C:\Program Files\JetBrains\IntelliJ IDEA 2017.3.4\bin" - Dfile.encoding = UTF - 8 - classpath C: \Users\ eacl\ IdeaProjects\ DATA_ALG\ out\ production\ DATA_ALG criticalpath.Graph
Following are all different paths from 0 to 4
-- -- -- -- -- -- -- -- -- -- -- -- -- -- --Find Earliest Start / Finish-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

	[
		[{
			"A": {
				"EarliestStart": 1,
				"EarliestFinish": 10
			}
		}, {
			"B": {
				"EarliestStart": 11,
				"EarliestFinish": 30
			}
		}, {
			"C": {
				"EarliestStart": 31,
				"EarliestFinish": 35
			}
		}, {
			"D": {
				"EarliestStart": 36,
				"EarliestFinish": 45
			}
		}, {
			"E": {
				"EarliestStart": 46,
				"EarliestFinish": 65
			}
		}, {
			"Total Duration": 65
		}],
		[{
			"A": {
				"EarliestStart": 1,
				"EarliestFinish": 10
			}
		}, {
			"B": {
				"EarliestStart": 11,
				"EarliestFinish": 30
			}
		}, {
			"C": {
				"EarliestStart": 31,
				"EarliestFinish": 35
			}
		}, {
			"G": {
				"EarliestStart": 36,
				"EarliestFinish": 40
			}
		}, {
			"E": {
				"EarliestStart": 46,
				"EarliestFinish": 65
			}
		}, {
			"Total Duration": 60
		}],
		[{
			"A": {
				"EarliestStart": 1,
				"EarliestFinish": 10
			}
		}, {
			"F": {
				"EarliestStart": 11,
				"EarliestFinish": 25
			}
		}, {
			"G": {
				"EarliestStart": 36,
				"EarliestFinish": 40
			}
		}, {
			"E": {
				"EarliestStart": 46,
				"EarliestFinish": 65
			}
		}, {
			"Total Duration": 50
		}],
		[{
			"A": {
				"EarliestStart": 1,
				"EarliestFinish": 10
			}
		}, {
			"H": {
				"EarliestStart": 11,
				"EarliestFinish": 25
			}
		}, {
			"E": {
				"EarliestStart": 46,
				"EarliestFinish": 65
			}
		}, {
			"Total Duration": 45
		}]
	]



	-- -- -- -- -- -- -- -- -- -- -- -- -- -- --Critical Path-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

	[{
		"A": {}
	}, {
		"B": {}
	}, {
		"C": {}
	}, {
		"D": {}
	}, {
		"E": {}
	}, {
		"Total Duration": 65
	}]



	-- -- -- -- -- -- -- -- -- -- -- -- -- -- --Find Latest Start / Finish-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

	[
		[{
			"A": {,
				"LatestStart": 1,
				"LatestFinish": 10
			}
		}, {
			"B": {,
				"LatestStart": 11,
				"LatestFinish": 30
			}
		}, {
			"C": {,
				"LatestStart": 31,
				"LatestFinish": 35
			}
		}, {
			"D": {,
				"LatestStart": 36,
				"LatestFinish": 45
			}
		}, {
			"E": {,
				"LatestStart": 46,
				"LatestFinish": 65
			}
		}, {
			"Total Duration": 65
		}],
		[{
			"A": {,
				"LatestStart": 1,
				"LatestFinish": 10
			}
		}, {
			"B": {,
				"LatestStart": 11,
				"LatestFinish": 30
			}
		}, {
			"C": {,
				"LatestStart": 31,
				"LatestFinish": 35
			}
		}, {
			"G": {,
				"LatestStart": 41,
				"LatestFinish": 45
			}
		}, {
			"E": {,
				"LatestStart": 46,
				"LatestFinish": 65
			}
		}, {
			"Total Duration": 60
		}],
		[{
			"A": {,
				"LatestStart": 1,
				"LatestFinish": 10
			}
		}, {
			"F": {,
				"LatestStart": 26,
				"LatestFinish": 40
			}
		}, {
			"G": {,
				"LatestStart": 41,
				"LatestFinish": 45
			}
		}, {
			"E": {,
				"LatestStart": 46,
				"LatestFinish": 65
			}
		}, {
			"Total Duration": 50
		}],
		[{
			"A": {,
				"LatestStart": 1,
				"LatestFinish": 10
			}
		}, {
			"H": {,
				"LatestStart": 31,
				"LatestFinish": 45
			}
		}, {
			"E": {,
				"LatestStart": 46,
				"LatestFinish": 65
			}
		}, {
			"Total Duration": 45
		}]
	]



	-- -- -- -- -- -- -- -- -- -- -- -- -- -- --Total Floats-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

	[
		[{
			"A": {,
				"Float Time": 10
			}
		}, {
			"B": {,
				"Float Time": 20
			}
		}, {
			"C": {,
				"Float Time": 5
			}
		}, {
			"D": {,
				"Float Time": 10
			}
		}, {
			"E": {,
				"Float Time": 20
			}
		}],
		[{
			"A": {,
				"Float Time": 10
			}
		}, {
			"B": {,
				"Float Time": 20
			}
		}, {
			"C": {,
				"Float Time": 5
			}
		}, {
			"G": {,
				"Float Time": 5
			}
		}, {
			"E": {,
				"Float Time": 20
			}
		}],
		[{
			"A": {,
				"Float Time": 10
			}
		}, {
			"F": {,
				"Float Time": 15
			}
		}, {
			"G": {,
				"Float Time": 5
			}
		}, {
			"E": {,
				"Float Time": 20
			}
		}],
		[{
			"A": {,
				"Float Time": 10
			}
		}, {
			"H": {,
				"Float Time": 15
			}
		}, {
			"E": {,
				"Float Time": 20
			}
		}]
	]



	-- -- -- -- -- -- -- -- -- -- -- -- -- -- --Complete Project Graph-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -

	[
		[{
			"A": {
				"EarliestStart": 1,
				"EarliestFinish": 10,
				"LatestStart": 1,
				"LatestFinish": 10,
				"Float Time": 10
			}
		}, {
			"B": {
				"EarliestStart": 11,
				"EarliestFinish": 30,
				"LatestStart": 11,
				"LatestFinish": 30,
				"Float Time": 20
			}
		}, {
			"C": {
				"EarliestStart": 31,
				"EarliestFinish": 35,
				"LatestStart": 31,
				"LatestFinish": 35,
				"Float Time": 5
			}
		}, {
			"D": {
				"EarliestStart": 36,
				"EarliestFinish": 45,
				"LatestStart": 36,
				"LatestFinish": 45,
				"Float Time": 10
			}
		}, {
			"E": {
				"EarliestStart": 46,
				"EarliestFinish": 65,
				"LatestStart": 46,
				"LatestFinish": 65,
				"Float Time": 20
			}
		}, {
			"Total Duration": 65
		}],
		[{
			"A": {
				"EarliestStart": 1,
				"EarliestFinish": 10,
				"LatestStart": 1,
				"LatestFinish": 10,
				"Float Time": 10
			}
		}, {
			"B": {
				"EarliestStart": 11,
				"EarliestFinish": 30,
				"LatestStart": 11,
				"LatestFinish": 30,
				"Float Time": 20
			}
		}, {
			"C": {
				"EarliestStart": 31,
				"EarliestFinish": 35,
				"LatestStart": 31,
				"LatestFinish": 35,
				"Float Time": 5
			}
		}, {
			"G": {
				"EarliestStart": 36,
				"EarliestFinish": 40,
				"LatestStart": 41,
				"LatestFinish": 45,
				"Float Time": 5
			}
		}, {
			"E": {
				"EarliestStart": 46,
				"EarliestFinish": 65,
				"LatestStart": 46,
				"LatestFinish": 65,
				"Float Time": 20
			}
		}, {
			"Total Duration": 60
		}],
		[{
			"A": {
				"EarliestStart": 1,
				"EarliestFinish": 10,
				"LatestStart": 1,
				"LatestFinish": 10,
				"Float Time": 10
			}
		}, {
			"F": {
				"EarliestStart": 11,
				"EarliestFinish": 25,
				"LatestStart": 26,
				"LatestFinish": 40,
				"Float Time": 15
			}
		}, {
			"G": {
				"EarliestStart": 36,
				"EarliestFinish": 40,
				"LatestStart": 41,
				"LatestFinish": 45,
				"Float Time": 5
			}
		}, {
			"E": {
				"EarliestStart": 46,
				"EarliestFinish": 65,
				"LatestStart": 46,
				"LatestFinish": 65,
				"Float Time": 20
			}
		}, {
			"Total Duration": 50
		}],
		[{
			"A": {
				"EarliestStart": 1,
				"EarliestFinish": 10,
				"LatestStart": 1,
				"LatestFinish": 10,
				"Float Time": 10
			}
		}, {
			"H": {
				"EarliestStart": 11,
				"EarliestFinish": 25,
				"LatestStart": 31,
				"LatestFinish": 45,
				"Float Time": 15
			}
		}, {
			"E": {
				"EarliestStart": 46,
				"EarliestFinish": 65,
				"LatestStart": 46,
				"LatestFinish": 65,
				"Float Time": 20
			}
		}, {
			"Total Duration": 45
		}]
	]




Process finished with exit code 0

```