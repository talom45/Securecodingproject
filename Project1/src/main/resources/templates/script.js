console.log ('JavaScript file loaded');
const wrapper = document.querySelector('.wrapper');
const loginLink = document.querySelector('.login-link');
const registerationLink = document.querySelector('.registeration-link');
const btnPopup = document.querySelector('.btnlogin-popup');
const iconClose = document.querySelector('.icon-close');


registerationLink.addEventListener('click',()=> {
    wrapper.classList.add('active');
} );

loginLink.addEventListener('click',()=> {
    wrapper.classList.remove('active');
} );
    
btnPopup.addEventListener('click',()=> {
    wrapper.classList.add('active-popup');
} );

iconClose.addEventListener('click',()=> {
    wrapper.classList.remove('active-popup');
} );

