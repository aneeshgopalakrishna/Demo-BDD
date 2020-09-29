pipeline {
    agent {
        label 'docker-slave'
    }
    stages {
       
         
        stage('Build') { 
           
            steps {
                dir('FinalDemoOfDocker'){
                    
                 sh label:'docker-slave' ,script: 'mvn package'
                
          
            
            
            }
        }
    }
}
