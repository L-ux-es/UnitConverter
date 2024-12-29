function showForm(formId) {
    document.getElementById('length-form').style.display = 'none';
    document.getElementById('weight-form').style.display = 'none';
    document.getElementById('temperature-form').style.display = 'none';
    document.getElementById(formId).style.display = 'flex';
}