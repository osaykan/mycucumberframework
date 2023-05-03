#!/bin/bash

TARGET_VERSION="109.0.5414.74"
DOWNLOAD_LINK="https://dl.google.com/linux/chrome/deb/pool/main/g/google-chrome-stable/google-chrome-stable_${TARGET_VERSION}-1_amd64.deb"
LOCAL_VERSION=$(google-chrome-stable --product-version)
INSTALL_FOLDER="/tmp/chrome"


if [[ -n "$(uname -a | grep Ubuntu)" ]]
then
    echo "OS: Ubuntu"

    if [[ "$TARGET_VERSION" != "$LOCAL_VERSION" ]]
    then
        echo "Chrome: Target chrome version are not available!"
        
        echo "Chrome: Uninstall $LOCAL_VERSION version"
        sudo apt-get remove --yes google-chrome-stable

        echo "Chrome: Install $TARGET_VERSION version"
        rm -rf $INSTALL_FOLDER && mkdir -p $INSTALL_FOLDER && cd $INSTALL_FOLDER
        wget -O 'chrome.deb' $DOWNLOAD_LINK
        sudo dpkg -i chrome.deb
        LOCAL_VERSION_AFTER_UPDATE=$(google-chrome-stable --product-version)

        if [[ "$TARGET_VERSION" == "$LOCAL_VERSION_AFTER_UPDATE" ]]
        then
            echo "Chrome: Installation of chrome $TARGET_VERSION was successfully"
        else
            echo "Chrome: Installation of chrome $TARGET_VERSION was not successfully"
        fi
    else
        echo "Chrome: Target chrome version are available!"
    fi
else
    echo "OS: is not Ubuntu, please adjust install script!"
fi