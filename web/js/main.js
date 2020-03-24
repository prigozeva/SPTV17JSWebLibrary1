
import {authModule} from './AuthModule.js';
import {userModule} from './UserModule.js';
document.getElementById('enter-menu').onclick=function(){
    toogleMenuActive('enter-menu');
    authModule.printLoginForm();
    userModele.printRegistrationForm();
}
document.getElementById('sysout').onclick=function(){
    toogleMenuActive('sysout');
}

function toogleMenuActive(elementId){
  let activeElement = document.getElementById(elementId);
  let passiveElements = document.getElementsByClassName("nav-item");
  for(let i = 0; i < passiveElements.length; i++){
    if(activeElement === passiveElements[i]){
      passiveElements[i].classList.add("active-menu");
    }else{
      if(passiveElements[i].classList.contains("active-menu")){
        passiveElements[i].classList.remove("active-menu");
      }
    }
  }
}

