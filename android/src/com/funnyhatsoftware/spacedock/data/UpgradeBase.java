// Generated code, any edits will be eventually lost.
package com.funnyhatsoftware.spacedock.data;

import java.util.ArrayList;
import java.util.Map;

public class UpgradeBase extends SetItem {
    String mAbility;
    public String getAbility() { return mAbility; }
    public UpgradeBase setAbility(String v) { mAbility = v; return this;}
    int mCost;
    public int getCost() { return mCost; }
    public UpgradeBase setCost(int v) { mCost = v; return this;}
    String mExternalId;
    public String getExternalId() { return mExternalId; }
    public UpgradeBase setExternalId(String v) { mExternalId = v; return this;}
    String mFaction;
    public String getFaction() { return mFaction; }
    public UpgradeBase setFaction(String v) { mFaction = v; return this;}
    boolean mPlaceholder;
    public boolean getPlaceholder() { return mPlaceholder; }
    public UpgradeBase setPlaceholder(boolean v) { mPlaceholder = v; return this;}
    String mSpecial;
    public String getSpecial() { return mSpecial; }
    public UpgradeBase setSpecial(String v) { mSpecial = v; return this;}
    String mTitle;
    public String getTitle() { return mTitle; }
    public UpgradeBase setTitle(String v) { mTitle = v; return this;}
    boolean mUnique;
    public boolean getUnique() { return mUnique; }
    public UpgradeBase setUnique(boolean v) { mUnique = v; return this;}
    String mUpType;
    public String getUpType() { return mUpType; }
    public UpgradeBase setUpType(String v) { mUpType = v; return this;}
    ArrayList<EquippedUpgrade> mEquippedUpgrades = new ArrayList<EquippedUpgrade>();
    @SuppressWarnings("unchecked")
    public ArrayList<EquippedUpgrade> getEquippedUpgrades() { return (ArrayList<EquippedUpgrade>)mEquippedUpgrades.clone(); }
    @SuppressWarnings("unchecked")
    public UpgradeBase setEquippedUpgrades(ArrayList<EquippedUpgrade> v) { mEquippedUpgrades = (ArrayList<EquippedUpgrade>)v.clone(); return this;}

    public void update(Map<String,Object> data) {
        super.update(data);
        mAbility = DataUtils.stringValue((String)data.get("Ability"));
        mCost = DataUtils.intValue((String)data.get("Cost"));
        mExternalId = DataUtils.stringValue((String)data.get("Id"));
        mFaction = DataUtils.stringValue((String)data.get("Faction"));
        mPlaceholder = DataUtils.booleanValue((String)data.get("Placeholder"));
        mSpecial = DataUtils.stringValue((String)data.get("Special"));
        mTitle = DataUtils.stringValue((String)data.get("Title"));
        mUnique = DataUtils.booleanValue((String)data.get("Unique"));
        mUpType = DataUtils.stringValue((String)data.get("Type"));
    }


    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return false;
        if (!(obj instanceof Upgrade))
            return false;
        Upgrade target = (Upgrade)obj;
        if (DataUtils.compareObjects(target.mAbility, mAbility))
            return false;
        if (target.mCost != mCost)
            return false;
        if (DataUtils.compareObjects(target.mExternalId, mExternalId))
            return false;
        if (DataUtils.compareObjects(target.mFaction, mFaction))
            return false;
        if (target.mPlaceholder != mPlaceholder)
            return false;
        if (DataUtils.compareObjects(target.mSpecial, mSpecial))
            return false;
        if (DataUtils.compareObjects(target.mTitle, mTitle))
            return false;
        if (target.mUnique != mUnique)
            return false;
        if (DataUtils.compareObjects(target.mUpType, mUpType))
            return false;
        if (!DataUtils.compareObjects(mEquippedUpgrades, target.mEquippedUpgrades))
            return false;
        return true;
    }

}
