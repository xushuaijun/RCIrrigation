// Generated code from Butter Knife. Do not modify!
package com.xsyj.rcirrigation.activity.dam;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.mikephil.charting.charts.LineChart;
import com.xsyj.rcirrigation.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DamDetailChartsActivity_ViewBinding implements Unbinder {
  private DamDetailChartsActivity target;

  @UiThread
  public DamDetailChartsActivity_ViewBinding(DamDetailChartsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DamDetailChartsActivity_ViewBinding(DamDetailChartsActivity target, View source) {
    this.target = target;

    target.titleTxt = Utils.findRequiredViewAsType(source, R.id.titleTxt, "field 'titleTxt'", TextView.class);
    target.lc_pipedetail = Utils.findRequiredViewAsType(source, R.id.lc_pipedetail, "field 'lc_pipedetail'", LineChart.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DamDetailChartsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleTxt = null;
    target.lc_pipedetail = null;
  }
}
