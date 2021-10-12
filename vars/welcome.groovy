def call(status,message){
  if(status=='success'){
     return "\033[32mStatus Success : \033[0m ${message}"
         
  }
  if(status=='info'){
     return "\033[34mStatus info : \033[0m ${message}"
         
  }
  if(status=='error'){
     return "\033[31mStatus Error : \033[0m ${message}"
         
  }
 
}
