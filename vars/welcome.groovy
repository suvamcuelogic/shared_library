def call(status,message){
  if(status=='success'){
     return "\033[32mStatus Success : \033[0m ${message}"
         
  }
 
}
