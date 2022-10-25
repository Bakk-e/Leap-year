# Leapyear
Firstly i pushed my project to github
Then i went into the action tab and then added the Java with Maven workflow. 
Which automaticly set up the correct files for the maven.yml and the folders needed.
Then i tested it to find out i forgot to add maven-surefire-plugin as a plugin so that it could actually run my test.
So i went back into my project and added it.
Then i tested the workflow with one where it shouldn't fail and one where it should fail.
And i worked perfectly.
