node{
  stage('SCM Checkout'){
  git 'https://github.com/jaffarautomation/MavenDemo'
  }
  
  stage('Compiler')
  {
      def mvhome =tool name: 'TestMaven', type: 'maven'
       sh "${mvhome}/bin/mvn clean test"
  }
  

}
