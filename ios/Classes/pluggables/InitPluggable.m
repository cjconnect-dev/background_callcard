//
//  InitPluggable.m
//  background_locator_2
//
//  Created by Mehdok on 6/7/21.
//

#import "InitPluggable.h"
#import "PreferencesManager.h"
#import "Globals.h"
#import "BackgroundCallcardPlugin.h"

@implementation InitPluggable {
    BOOL isInitCallbackCalled;
}

- (instancetype)init {
    self = [super init];
    if (self) {
        isInitCallbackCalled = NO;
    }
    return self;
}

- (void)onServiceDispose {
    isInitCallbackCalled = NO;
}

- (void)onServiceStart:(NSDictionary*) initialDataDictionary {
    if (!isInitCallbackCalled) {
        NSDictionary *map = @{
                         kArgInitCallback : @([PreferencesManager getCallbackHandle:kInitCallbackKey]),
                         kArgInitDataCallback: initialDataDictionary
                         };
        [[BackgroundCallcardPlugin getInstance] invokeMethod:kBCMInit arguments:map];
    }
    isInitCallbackCalled = YES;
}

- (void)setCallback:(int64_t)callbackHandle {
    [PreferencesManager setCallbackHandle:callbackHandle key:kInitCallbackKey];
}

@end
