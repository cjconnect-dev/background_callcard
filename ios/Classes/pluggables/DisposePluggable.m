//
//  DisposePluggable.m
//  background_locator_2
//
//  Created by Mehdok on 6/7/21.
//

#import "DisposePluggable.h"
#import "PreferencesManager.h"
#import "Globals.h"
#import "BackgroundCallcardPlugin.h"

@implementation DisposePluggable

- (void)onServiceDispose {
    NSDictionary *map = @{
                     kArgDisposeCallback : @([PreferencesManager getCallbackHandle:kDisposeCallbackKey])
                     };
    [[BackgroundCallcardPlugin getInstance] invokeMethod:kBCMDispose arguments:map];
}

- (void)onServiceStart:(NSDictionary *)initialDataDictionary {
    // nop
}

- (void)setCallback:(int64_t)callbackHandle {
    [PreferencesManager setCallbackHandle:callbackHandle key:kDisposeCallbackKey];
}

@end
