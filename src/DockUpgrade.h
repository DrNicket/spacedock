//
//  DockUpgrade.h
//  Space Dock
//
//  Created by Rob Tsuk on 9/7/14.
//  Copyright (c) 2014 Rob Tsuk. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>
#import "DockComponent.h"

@class DockEquippedUpgrade;

@interface DockUpgrade : DockComponent

@property (nonatomic, retain) NSString * ability;
@property (nonatomic, retain) NSNumber * attack;
@property (nonatomic, retain) NSNumber * cost;
@property (nonatomic, retain) NSNumber * placeholder;
@property (nonatomic, retain) NSString * range;
@property (nonatomic, retain) NSString * sortString;
@property (nonatomic, retain) NSString * special;
@property (nonatomic, retain) NSNumber * unique;
@property (nonatomic, retain) NSSet *equippedUpgrades;
@end

@interface DockUpgrade (CoreDataGeneratedAccessors)

- (void)addEquippedUpgradesObject:(DockEquippedUpgrade *)value;
- (void)removeEquippedUpgradesObject:(DockEquippedUpgrade *)value;
- (void)addEquippedUpgrades:(NSSet *)values;
- (void)removeEquippedUpgrades:(NSSet *)values;

@end
