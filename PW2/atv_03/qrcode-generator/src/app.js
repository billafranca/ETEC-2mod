document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('qrForm');
    const qrInput = document.getElementById('qrInput');
    const qrCodeContainer = document.getElementById('qrcode');

    form.addEventListener('submit', (e) => {
        e.preventDefault();
        const inputValue = qrInput.value;

        if (inputValue) {
            qrCodeContainer.innerHTML = '';
            new QRCode(qrCodeContainer, {
                text: inputValue,
                width: 256,
                height: 256
            });
        }
    });
});