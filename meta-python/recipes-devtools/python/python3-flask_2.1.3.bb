SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
DESCRIPTION = "\
Flask is a microframework for Python based on Werkzeug, Jinja 2 and good \
intentions. And before you ask: It’s BSD licensed!"
HOMEPAGE = "https://github.com/mitsuhiko/flask/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

SRC_URI[sha256sum] = "15972e5017df0575c3d6c090ba168b6db90259e620ac8d7ea813a396bad5b6cb"

PYPI_PACKAGE = "Flask"

inherit pypi setuptools3

CLEANBROKEN = "1"

RDEPENDS:${PN} = " \
    ${PYTHON_PN}-werkzeug \
    ${PYTHON_PN}-jinja2 \
    ${PYTHON_PN}-itsdangerous \
    ${PYTHON_PN}-click \
    ${PYTHON_PN}-profile \
"
