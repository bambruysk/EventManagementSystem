package md5c4adeb44b620b0eea12551b0d181ac57;


public class RulesSearchRecyclerViewAdapter_RulesFilter
	extends android.widget.Filter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_performFiltering:(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;:GetPerformFiltering_Ljava_lang_CharSequence_Handler\n" +
			"n_publishResults:(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V:GetPublishResults_Ljava_lang_CharSequence_Landroid_widget_Filter_FilterResults_Handler\n" +
			"";
		mono.android.Runtime.register ("Experiment.Search.RulesSearchRecyclerViewAdapter+RulesFilter, Experiment", RulesSearchRecyclerViewAdapter_RulesFilter.class, __md_methods);
	}


	public RulesSearchRecyclerViewAdapter_RulesFilter ()
	{
		super ();
		if (getClass () == RulesSearchRecyclerViewAdapter_RulesFilter.class)
			mono.android.TypeManager.Activate ("Experiment.Search.RulesSearchRecyclerViewAdapter+RulesFilter, Experiment", "", this, new java.lang.Object[] {  });
	}

	public RulesSearchRecyclerViewAdapter_RulesFilter (md5c4adeb44b620b0eea12551b0d181ac57.RulesSearchRecyclerViewAdapter p0)
	{
		super ();
		if (getClass () == RulesSearchRecyclerViewAdapter_RulesFilter.class)
			mono.android.TypeManager.Activate ("Experiment.Search.RulesSearchRecyclerViewAdapter+RulesFilter, Experiment", "Experiment.Search.RulesSearchRecyclerViewAdapter, Experiment", this, new java.lang.Object[] { p0 });
	}


	public android.widget.Filter.FilterResults performFiltering (java.lang.CharSequence p0)
	{
		return n_performFiltering (p0);
	}

	private native android.widget.Filter.FilterResults n_performFiltering (java.lang.CharSequence p0);


	public void publishResults (java.lang.CharSequence p0, android.widget.Filter.FilterResults p1)
	{
		n_publishResults (p0, p1);
	}

	private native void n_publishResults (java.lang.CharSequence p0, android.widget.Filter.FilterResults p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
