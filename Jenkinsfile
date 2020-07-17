pipeline {
    agent any

    stages {
        stage('Build') {
            steps {

                echo 'Building..'
                bat 'mvn package'
            }
        }
        stage('Jar Deploy') {
            steps {
<<<<<<< HEAD
                echo 'Jar Deployed....'
                archiveArtifacts artifacts: '**/target/*.jar'
            }
        }
         steps {
                echo 'Jar Running..'
               bat 'java -jar FinalDemoOfDocker-0.0.1-SNAPSHOT-jar-with-dependencies.jar'
            }
        }

    }
}
=======
                echo 'Jar Deployed...'
                archiveArtifacts artifacts: '**/target/*.jar'
            }
        }
         steps {
                echo 'Jar Running..'
               bat 'java -jar FinalDemoOfDocker-0.0.1-SNAPSHOT-jar-with-dependencies.jar'
            }
        }

    }
}
>>>>>>> branch 'master' of https://github.com/aneeshgopalakrishna/Demo-BDD.git
