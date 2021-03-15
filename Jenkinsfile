pipeline {

   agent any
  		tools {
   			maven 'maven'
   		}

   stages {
      stage('Build') {
         steps {
         
            // Get some code from a GitHub repository
            git 'https://github.com/mistry-raksha/Jenkins'
            
            // To run Maven on a Windows agent, use

             bat "mvn -Dmaven.test.failure.ignore=true clean package"

			 }
		}	
   	}

}