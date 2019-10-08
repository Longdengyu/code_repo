Target.class:
	javac Target.java

Test.class:
	javac -cp  fastjson.1.2.47.jar Test.java

run:
	# this will not work
	java -cp fastjson.1.2.47.jar:. Test 

run2:
	# this works
	java -Dfastjson.parser.autoTypeAccept=Target -cp fastjson.1.2.47.jar:. Test 
