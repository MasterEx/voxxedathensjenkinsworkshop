pipeline {
	agent any
	stages {
		stage('Compile') {
			steps {
				sh 'mvn clean build'
			}
		}
		
		stage('Unit test') {
			steps {
				sh 'mnv test'
			}
		}
		
		stage('Build package') {
			steps {
				sh 'mvn clean package'
			}
		}
	}
}
