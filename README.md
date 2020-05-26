"# Android-In-App-Billing-v3-Library" 


To get this Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle integration

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.fruzelee:Android-In-App-Billing-v3-Library:1.0'
	}


maven integration
    
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

Step 2. Add the dependency

	<dependency>
	    <groupId>com.github.fruzelee</groupId>
	    <artifactId>Android-In-App-Billing-v3-Library</artifactId>
	    <version>1.0</version>
	</dependency>


sbt  integration
   
Add it in your build.sbt at the end of resolvers:

    resolvers += "jitpack" at "https://jitpack.io"
        
Step 2. Add the dependency

	
	libraryDependencies += "com.github.fruzelee" % "Android-In-App-Billing-v3-Library" % "1.0"	


    
leiningen  integration
    
Add it in your project.clj at the end of repositories:

    :repositories [["jitpack" "https://jitpack.io"]]
        
Step 2. Add the dependency

	:dependencies [[com.github.fruzelee/Android-In-App-Billing-v3-Library "1.0"]]	


    
    
