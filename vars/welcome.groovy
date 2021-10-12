def call(status,message){
  if(status=='success'){
      ansiColor('xterm')
         {
            echo "\033[34mHello\033[0m ${message}"
         }
  }
 
}
