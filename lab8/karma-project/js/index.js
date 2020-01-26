// // mamy dwa argumenty funkcji element i regexp - jeśli nie wyszuka po regexp to usuwa elemment - jeśl i
// window.validator = function(element, regexp) {
//     const isValidated = element.value.search(regexp);
//     const diffrents = function(cos, callBack) {
//     if (cos) {
//         callBack();
//     }
//     }
//     if (isValidated > -1) {
//         element.classList.remove('invalid');
//     } else {
//         element.classList.add('invalid');
//     }
// }

// export default window.validator;

  
const INVALID = 'invalid';

$.fn.validate = function(regularExpression) {
    return this.each(function () {
        const $element = $(this);
        if (!$element.is('input:test')) {
            throw new Error('Element is not input type text!');
        }
        const inputText = $element.attr('val');
        const checkIsValid = inputText.search(regularExpression);
        checkIsValid > -1 ? $element.removeClass(INVALID) : $element.addClass(INVALID);
    });
};

export default $.fn.validate;