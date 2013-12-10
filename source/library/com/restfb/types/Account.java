/*
 * Copyright (c) 2010-2013 Mark Allen.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.restfb.types;

import com.restfb.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the <a href="http://developers.facebook.com/docs/api#impersonation">Account Graph API type</a>.
 *
 * @author <a href="http://restfb.com">Mark Allen</a>
 */
public class Account extends CategorizedFacebookType {
  private static final long serialVersionUID = 1L;
  @Facebook("access_token")
  private String accessToken;

  @Facebook("category")
  private String category;

  @Facebook("name")
  private String name;

  @Facebook("id")
  private String id;

  @Facebook("perms")
  private List<String> perms = new ArrayList<String>();

  /**
   * An OAuth access token for this account / page.
   *
   * @return An OAuth access token for this account.
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * The category for this account / page.
   * @return
   */
  public String getCategory() {
    return category;
  }

  /**
   * The name of of this account / page.
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   * The ID of this account / page.
   * @return
   */
  public String getId() {
    return id;
  }

  /**
   * A list of permissions the user has for this page.
   * <a href="https://developers.facebook.com/docs/facebook-login/access-tokens/#pagetokens">see roles list here</a>
   * @return
   */
  public List<String> getPerms() {
    return perms;
  }
}