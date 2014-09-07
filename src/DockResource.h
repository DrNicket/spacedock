//
//  DockResource.h
//  Space Dock
//
//  Created by Rob Tsuk on 9/7/14.
//  Copyright (c) 2014 Rob Tsuk. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>
#import "DockComponent.h"

@class DockSquad;

@interface DockResource : DockComponent

@property (nonatomic, retain) NSString * ability;
@property (nonatomic, retain) NSNumber * cost;
@property (nonatomic, retain) NSString * special;
@property (nonatomic, retain) NSString * type;
@property (nonatomic, retain) NSNumber * unique;
@property (nonatomic, retain) NSSet *squad;
@end

@interface DockResource (CoreDataGeneratedAccessors)

- (void)addSquadObject:(DockSquad *)value;
- (void)removeSquadObject:(DockSquad *)value;
- (void)addSquad:(NSSet *)values;
- (void)removeSquad:(NSSet *)values;

@end
