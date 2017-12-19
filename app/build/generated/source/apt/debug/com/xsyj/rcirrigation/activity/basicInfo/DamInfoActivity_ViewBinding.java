// Generated code from Butter Knife. Do not modify!
package com.xsyj.rcirrigation.activity.basicInfo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.xsyj.rcirrigation.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DamInfoActivity_ViewBinding implements Unbinder {
  private DamInfoActivity target;

  @UiThread
  public DamInfoActivity_ViewBinding(DamInfoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DamInfoActivity_ViewBinding(DamInfoActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DamInfoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
  }
}
