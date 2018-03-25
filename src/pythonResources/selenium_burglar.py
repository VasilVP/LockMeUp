#! usr/bin/env python

import sys
import time
import argparse

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


FB_LOGIN = 'https://m.facebook.com/'
FB_CHANGE_PASS = 'https://m.facebook.com/settings/security/password/'

parser = argparse.ArgumentParser()
parser.add_argument("-u", "--user")
parser.add_argument("-p", "--password")
parser.add_argument("-n", "--newpass")
args = parser.parse_args()

user_login_credential = args.user
user_pass_credential = args.password
user_new_pass = args.newpass

def main():
    """
    This is a glorified script.
    """
    # initiate connection
    br = webdriver.Chrome(executable_path='./driver/chromedriver')
    
    # part 1, login to facebook
    user_field = "m_login_email"
    login_pass_id = 'm_login_password'
    login_submit_xpath = '//button[@value="Log In"]'
    
    br.get(FB_LOGIN)
    u = br.find_element_by_id(user_field)
    p = br.find_element_by_css_selector('#' + login_pass_id)
    lb = br.find_element_by_xpath(login_submit_xpath)
    u.send_keys(user_login_credential)
    u.send_keys(Keys.TAB)
    p.send_keys(user_pass_credential)
    lb.click()
    
    # antract
    #logo_xpath = '//h1[@value="Facebook logo"]'
    #elem = WebDriverWait(
    #        br, 12
    #    ).until(
    #        lambda br: br.find_element_by_xpath(logo_xpath)
    #    )
    time.sleep(5)
    
    # part 2, change password
    password_fields_xpath = '//input[@type="password"]'
    submit_pass_xpath = '//button[@type="submit"]'
    
    br.get(FB_CHANGE_PASS)
    pass_fields = br.find_elements_by_xpath(password_fields_xpath)
    pass_fields[0].send_keys(user_pass_credential)
    pass_fields[1].send_keys(user_new_pass)
    pass_fields[2].send_keys(user_new_pass)
    sb = br.find_element_by_xpath(submit_pass_xpath)
    sb.click()
    
    # exit
    br.quit()
    return True


if __name__ == "__main__":
    try:
        main()
    except:
        sys.exit(1)