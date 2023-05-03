#!/bin/bash




MVN_PROFILE=chrome-regression-backend1



SE_THREAD_COUNT=1

if [ ! -f ~/Development/passwords/aec ]; then
  echo "Please put passwords to ~/Development/passwords/overrides.properties"
else
  source ~/Development/passwords/aec
fi

if [ -z "${_PCELLAB_PASSWORD}" ] &&[ -z "${A_PARLAB_EMAIL}" ] &&[ -z "${A_BAFFICE_USERNAME}" ] && [ -z "${A_GUEST_PASSWORD}" ] && [ -z "${AC_NEWSLETTER_HOMEPAGE_PASSWORD}" ] && [ -z "${C_BACFICE_PASSWORD}" ] && [ -z "${EC_RETERED_CUSTOMER_PASSWORD}" ] && [ -z "${AC_PAYPAL_PASSWORD}"]; then
  echo "Requered ENV vars are not exist"
  echo "Please put passwords to ~/Development/passwords/overrides.properties"
else
  mvn -D AC_BACKOFFICE_USERNAME=$AC_BACKOFFICE_USERNAME \
      -D A_PALAB_PASSWORD=$AC_PAELLAB_PASSWORD \
      -D C_PARCEMAIL=$EC_PARCELLAB_EMAIL \
      -D AEC_GUEST_PASSWORD=$AEC_GUEST_PASSWORD \
      -D AEC_NEWSLETTER_HOMEPAGE_PASSWORD=$AEC_NEWSLETTER_HOMEPAGE_PASSWORD \
      -D AEC_BACKOFFICE_PASSWORD=$AEC_BACKOFFICE_PASSWORD \
      -D AEC_REGISTERED_CUSTOMER_PASSWORD=$AEC_REGISTERED_CUSTOMER_PASSWORD \
      -D AEC_PAYPAL_PASSWORD=$AEC_PAYPAL_PASSWORD \
      -D se.threadCount=$SE_THREAD_COUNT \
      -P $MVN_PROFILE \
      -fn --no-transfer-progress \
      clean verify
fi
